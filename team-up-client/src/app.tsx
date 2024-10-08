import Navbar from "./components/navbar/navbar.tsx";
import styled from "styled-components";
import FindSportPage from "./pages/find-sport.page.tsx";
import {QueryClient, QueryClientProvider} from "@tanstack/react-query";


const Body = styled.div`
    width: 65vw;
    margin: 0 auto;
    padding-top: 5rem;
`

const queryClient = new QueryClient();

const App = () => {
    return (
        <QueryClientProvider client={queryClient}>
            <Navbar/>
            <Body>
                <FindSportPage/>
            </Body>
        </QueryClientProvider>
    )
}

export default App;
