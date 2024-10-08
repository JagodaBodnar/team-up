import { configureStore } from "@reduxjs/toolkit";
import languageReducer from "./slices/LanguageSlice";
import teamFilterReducer from "./slices/TeamFilterSlice";
import sportCategoriesReducer from "./slices/SportCategorySlice";

export const store = configureStore({
  reducer: {
    language: languageReducer,
    teamFilter: teamFilterReducer,
    sportCategories: sportCategoriesReducer
  }
});

export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;