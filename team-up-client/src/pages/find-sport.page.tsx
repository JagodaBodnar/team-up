import styled from "styled-components";
import SportCategory from "../components/sport-category/sport-category.tsx";
import {useDispatch, useSelector} from "react-redux";
import {AppDispatch, RootState} from "../store/store.ts";
import {removeSportFilter, toggleSportFilter} from "../store/slices/TeamFilterSlice.ts";
import {SyntheticEvent, useState} from "react";
import {Chip, CircularProgress, Tab, Tabs} from "@mui/material";
import {Place, SportsVolleyball} from "@mui/icons-material";
import LocationFilter from "../components/filters/location-filter.tsx";
import {SportDto} from "../../output/typescript-fetch/src";
import {useGetSports} from "./sport-query.ts";

const SelectedFilters = styled.div`
    display: flex;
    width: 100%;
    justify-content: flex-start;
    gap: 0.5rem;
    flex-wrap: wrap;
`

const LocationFilterWrapper = styled.section`
    padding: 2rem 0;
    width: 100%;
`

const SportCategoriesWrapper = styled.div`
    display: flex;
    flex-wrap: wrap;
    padding: 1.5rem;
    gap: 1.5rem;
    justify-content: flex-start;
`

const Filters = styled.div`
    display: flex;
    flex-direction: column;
    align-items: flex-start;
`



const FindSportPage = () => {
    const [value, setValue] = useState(0);
    const selectedSports = useSelector((state: RootState) => state.teamFilter.sports);
    // const selectedCity = useSelector((state: RootState) => state.teamFilter.city);

    const { data, isLoading, isSuccess } = useGetSports();

    const sports = data?.data?.listOfSports ?? [];

    console.log('data', data);
    const handleChange = (_event: SyntheticEvent, newValue: number) => {
        setValue(newValue);
    };

    const dispatch: AppDispatch = useDispatch();

    const addSelectionToState = (sport: SportDto): void => {
        dispatch(toggleSportFilter(sport));
    }

    const handleDelete = (sport: SportDto): void => {
        dispatch(removeSportFilter(sport));
    };

    return (
        <Filters>
            <SelectedFilters>
                {/*{selectedCity && <Chip*/}
                {/*    label={selectedCity}*/}
                {/*    onDelete={() => handleDelete(sport)}*/}
                {/*/>}*/}

                {selectedSports.map((sport: SportDto) => (
                    <Chip
                        key={sport.id}
                        label={sports.find((sc: SportDto) => sc.id === sport.id)?.code}
                        onDelete={() => handleDelete(sport)}
                    />
                ))}
            </SelectedFilters>



            <Tabs
                value={value}
                onChange={handleChange}
                textColor="secondary"
                indicatorColor="secondary"
                sx={{fontSize: "1.2rem"}}
            >
                <Tab icon={<Place/>} iconPosition="start" label="Location"/>
                <Tab icon={<SportsVolleyball/>} iconPosition="start"  label="Sports category"/>
            </Tabs>
            {value === 0 &&
                <LocationFilterWrapper>
                    <LocationFilter/>
                </LocationFilterWrapper>
            }
            {isLoading && <CircularProgress />}
            {isSuccess && value === 1 &&
                <SportCategoriesWrapper>
                    {sports.map((sport: SportDto) => (
                        <SportCategory handleSelection={addSelectionToState} key={sport.id} sport={sport}
                                       selectedSports={selectedSports}/>
                    ))}
                </SportCategoriesWrapper>
            }
        </Filters>
    )
}

export default FindSportPage;
