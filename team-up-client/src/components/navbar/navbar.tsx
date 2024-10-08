import styled from "styled-components";
import SelectLanguage from "../select-language/select-language.tsx";

const Container = styled.nav`
    width: 100%;
`

const Wrapper = styled.div`
    max-width: 80vw;
    margin: 0 auto;
    height: fit-content;
    display: grid;
    justify-content: space-between;
    grid-template-columns: repeat(2, 1fr);
    overflow: hidden;
    align-items: flex-end;
`

const Menu = styled.div`
    display: flex;
    column-gap: 5rem;
    justify-content: flex-end;
    align-items: flex-end;
`

const Logo = styled.img`
    border-radius: 0.5rem;
    max-height: 10rem;
    max-width: 17rem;
`

const LoginButton = styled.button`
    background-color: transparent;
    font-size: 2.5rem;
    color: rebeccapurple;
    cursor: pointer;
    border: none;
    font-weight: 700;
    padding-bottom: 0.2rem;
`

const onLoginButtonClicked = () => {
    console.log('elo elo');
}

const Navbar = () => {
    return (
        <Container>
           <Wrapper>
               <Logo src={'public/logo.png'}></Logo>
                <Menu>
                    <SelectLanguage/>
                    <LoginButton id="login-button" onClick={onLoginButtonClicked}>Login</LoginButton>
                </Menu>
           </Wrapper>
        </Container>

    );
}

export default Navbar;