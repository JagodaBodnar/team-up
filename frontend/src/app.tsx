import {useDispatch, useSelector} from "react-redux";
import {AppDispatch, RootState} from "./store/store.ts";
import {setActive} from "./store/slices/TestSlice.ts";
import './app.css'

const App = () => {
  const active = useSelector((state: RootState) => state.test.active)
  const dispatch = useDispatch<AppDispatch>();
  const handleToggleActive = () => {
    dispatch(setActive(!active))
  }

  return (
    <div>
      Team up.
      <div className="app-active-checkbox">
        <p>Is active</p>
        <input type="checkbox" checked={active}/>
      </div>
      <button onClick={handleToggleActive}>Toggle active</button>
    </div>
  )
}

export default App;
