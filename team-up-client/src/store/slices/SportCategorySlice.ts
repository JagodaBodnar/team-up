import {createSlice, PayloadAction} from "@reduxjs/toolkit";
import {SportDto} from "../../../output/typescript-fetch/src";

interface SportCategoryState {
    sportCategories: SportDto[];
}

const initialState: SportCategoryState = {
    sportCategories: []
}


const sportCategorySlice = createSlice({
    name: 'sportCategories',
    initialState,
    reducers: {
        setSportCategories: (state, action: PayloadAction<SportDto[]>): void => {
            state.sportCategories = action.payload;
        }
    }
})

export const { setSportCategories } = sportCategorySlice.actions;
export default sportCategorySlice.reducer;