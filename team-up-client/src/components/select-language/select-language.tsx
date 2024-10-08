import styled from "styled-components";
import {LANGUAGES as languages} from "./data.ts";
import {useDispatch, useSelector} from "react-redux";
import {AppDispatch, RootState} from "../../store/store.ts";
import {setLanguage} from "../../store/slices/LanguageSlice.ts";
import {MouseEvent} from "react";


const Wrapper = styled.div`
    display: flex;
    flex-direction: column;
    min-width: 15rem;
`

const Label = styled.label`
    padding-left: 0.6rem;
    font-size: 1.6rem;
    color: dimgrey;
`

const OptionsWrapper = styled.div`
    display: flex;
`

const Option = styled.button<{$active: boolean}>`
    background-color: transparent;
    border: none;
    font-size: 2.2rem;
    transform: scale(1,1);
    color: ${(props) => (props.$active ? 'rebeccapurple' : 'dimgrey')};
    min-width: 3.5rem;
    font-weight: ${(props) => (props.$active ? 700 : 500)};

    
    &::after {
        content: '';
        background-color: transparent;
        height: 0.2rem;
        width: 100%;
        display: block;
        transition: all 0.3s ease-out;
    }
    
    &:hover {
        transform: scale(1.1,1.1);
        cursor: pointer;
    }

    &:hover::after {
        background-color: rebeccapurple;
        transition: all 0.4s ease-in;
    }

`

export interface Language {
    label: string;
    value: string;
}


const SelectLanguage = () => {
    const selectedLang = useSelector((state: RootState) => state.language.selectedLanguage);
    const dispatch: AppDispatch = useDispatch();

    const handleLanguageChange = (event: MouseEvent<HTMLButtonElement>): void => {

        const foundLanguage = languages.find(language => language.value === event.currentTarget.value);

        if (!foundLanguage) {
            console.error('Language was not found!');
            return;
        }

        dispatch(setLanguage(foundLanguage));
    }

    return (
        <Wrapper>
            <Label>{selectedLang.label}</Label>
            <OptionsWrapper>
                {languages.map(lang => {
                    return <Option $active={selectedLang.value === lang.value} id={lang.value} key={lang.value} value={lang.value}
                                   onClick={handleLanguageChange}>{lang.value}</Option>
                })}
            </OptionsWrapper>
        </Wrapper>
    );
};


export default SelectLanguage;