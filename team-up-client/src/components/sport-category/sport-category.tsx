import styled from "styled-components";
import {SportDto} from "../../../output/typescript-fetch/src";


const Container = styled.div<{$active: boolean}>`
    max-width: calc(15% - 3rem);
    max-height: 50rem;
    width: 7.5rem;
    height: 7.5rem;
    aspect-ratio: 1 / 1;

    border-radius: 1rem;
    padding: 1rem;

    cursor: pointer;
    
    user-select: none;
    flex-wrap: nowrap;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;

    background: ${(props) => (props.$active ? "linear-gradient(135deg, #9381A3, #B8ADC3)" : "linear-gradient(135deg, #FFFEF0, #FDFAD9)")};
    
    box-shadow: rgba(0, 0, 0, 0.3) 0 0.5rem 1.1rem, rgba(0, 0, 0, 0.22) 0 0.6rem 1rem;

    &:hover {
        transform: scale(1.05);

    }
`

const Text = styled.span`
    font-size: 0.8rem;
    font-weight: 700;
`

const Icon = styled.img`
    border-radius: 3rem;
    width: 100%;
    height: 100%; 
    object-fit: contain;
`

interface SportCategoryProps {
    sport: SportDto;
    handleSelection: (sport: SportDto) => void;
    selectedSports: SportDto[];
}


const SportCategory = ({ sport, handleSelection, selectedSports }: SportCategoryProps) => {
    return (
        sport && <Container $active={selectedSports.includes(sport)} onClick={() => handleSelection(sport)}>
            <Icon src={`src/assets/icons/${sport?.icon}`} alt={sport?.code} draggable={false}/>
            <Text>{sport?.code}</Text>
        </Container>
    );
};

export default SportCategory;