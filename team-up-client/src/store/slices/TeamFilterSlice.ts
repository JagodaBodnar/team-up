import {createSlice, PayloadAction} from "@reduxjs/toolkit";
import {SportDto} from "../../../output/typescript-fetch/src";
import {City, Location} from "../../components/filters/data.ts";

interface TeamFilterState {
    city?: City;
    location?: Location;
    sports: SportDto[];
}

const initialState: TeamFilterState = {
    city: undefined,
    location: undefined,
    sports: []
}

const removeSportSelection = (sports: SportDto[], sportId?: string) => {
    return sports.filter((sport: SportDto): boolean => sport.id !== sportId);
}

const teamFilterSlice = createSlice({
    name: 'teamFilter',
    initialState,
    reducers: {
        setCityFilter: (state, action: PayloadAction<City>): void => {
            state.city = action.payload;
        },
        setLocationFilter: (state, action: PayloadAction<Location>): void => {
            state.location = action.payload;
        },
        removeSportFilter: (state, action: PayloadAction<SportDto>): void => {
            state.sports = removeSportSelection(state.sports, action.payload.id);
        },
        toggleSportFilter: (state, action: PayloadAction<SportDto>): void => {
            if (!state.sports.includes(action.payload)) {
                state.sports = [...state.sports, action.payload];
            } else {
                state.sports = removeSportSelection(state.sports, action.payload.id);
            }
        }
    }
})

export const {setCityFilter, toggleSportFilter, removeSportFilter } = teamFilterSlice.actions;
export default teamFilterSlice.reducer;