import {createSlice, PayloadAction} from "@reduxjs/toolkit";
import {Language} from "../../component/select-language/select-language.tsx";
import {LANGUAGES} from "../../component/select-language/data.ts";

interface LanguageState {
    selectedLanguage: Language
}

const initialState: LanguageState = {
    selectedLanguage: LANGUAGES[0]
}

const languageSlice = createSlice({
    name: 'language',
    initialState,
    reducers: {
        setLanguage: (state, action: PayloadAction<Language>) => {
            state.selectedLanguage = action.payload
        }
    }
})

export const {setLanguage} = languageSlice.actions;
export default languageSlice.reducer;