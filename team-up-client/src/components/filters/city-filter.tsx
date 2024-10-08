import styled from "styled-components";
import {useState} from "react";
import {Autocomplete, CircularProgress, TextField} from "@mui/material";
import {AppDispatch} from "../../store/store.ts";
import {useDispatch} from "react-redux";
import {setCityFilter} from "../../store/slices/TeamFilterSlice.ts";
import {City, mockCities} from "./data.ts";

const Container = styled.div`
    max-width: 30rem;
    width: 100%;
`

const LocationAutocomplete = styled(Autocomplete)`
    & .MuiAutocomplete-inputRoot {
        border-radius: 1rem;
    }
`

const CityFilter = () => {
    const [open, setOpen] = useState(false);
    const [options, setOptions] = useState<readonly City[]>([]);
    const [loading, setLoading] = useState(false);

    const dispatch: AppDispatch = useDispatch();


    const handleOpen = () => {
        setOpen(true);
        (async () => {
            setLoading(true);
            setOptions([...mockCities]);
            setLoading(false);
        })();
    };

    const handleClose = () => {
        setOpen(false);
        setOptions([]);
    };

    return (
        <Container>
            <LocationAutocomplete
                open={open}
                onOpen={handleOpen}
                onClose={handleClose}
                onChange={(_event, newValue): void => {
                    dispatch(setCityFilter(newValue as City));
                }}
                isOptionEqualToValue={(option, value): boolean => (option as City).id === (value as City).id}
                getOptionLabel={(option) => (option as City).name}
                groupBy={(option) => (option as City).country}
                options={options}
                loading={loading}
                renderInput={(params) => (
                    <TextField
                        {...params}
                        label="Choose city"
                        slotProps={{
                            input: {
                                ...params.InputProps,
                                endAdornment: (
                                    <>
                                        {loading ? <CircularProgress color="inherit" size={20}/> : null}
                                        {params.InputProps.endAdornment}
                                    </>
                                ),
                            },
                        }}
                    />
                )}
            />
        </Container>
    );
};

export default CityFilter;