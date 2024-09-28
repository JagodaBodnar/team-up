import styled from "styled-components";

const Navbar = styled.div`
    height: fit-content;
    display: grid;
    justify-content: space-between;
    grid-template-columns: repeat(2, 1fr);
    overflow: hidden;
    margin-top: 3rem;
`

const ActionContainer = styled.div`
    display: grid;
    grid-column-gap: 1rem;
    justify-content: flex-end;
`

const Logo = styled.img`
    border-radius: 0.5rem;
    max-height: 8rem;
    max-width: 12rem;
`

const LoginButton = styled.button`

    background-color: transparent;
    width: fit-content;
    font-size: 2.5rem;
    font-weight: 800;
    color: black;
    cursor: pointer;
    height: fit-content;
    border: none;
    padding: 0.2rem;

`

const onLoginButtonClicked = () => {
    console.log('elo elo');
}


export const NavBarComponent = () => {

    return (
       <>
           <Navbar>
               <Logo src={'public/logo.png'}></Logo>
                <ActionContainer>
                    <LoginButton id="login-button" onClick={onLoginButtonClicked}>Login</LoginButton>
                </ActionContainer>
           </Navbar>
           logo, lang, login/profile

       </>
    );
}