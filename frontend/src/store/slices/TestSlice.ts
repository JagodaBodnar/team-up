import {createSlice, PayloadAction} from "@reduxjs/toolkit";

interface TestState {
  active: boolean
}

const initialState: TestState = {
  active: false
}

const testSlice = createSlice({
  name: 'test',
  initialState,
  reducers: {
    setActive: (state, action: PayloadAction<boolean>) => {
      state.active = action.payload
    }
  }
})

export const {setActive} = testSlice.actions;
export default testSlice.reducer;