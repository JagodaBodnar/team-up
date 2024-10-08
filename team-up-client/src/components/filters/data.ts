
export const mockCities: City[] =
    [
        {
            country: 'PL',
            name: 'Warsaw',
            id: "1"
        },
        {
            country: 'PL',
            name: 'Wroclaw',
            id: "2"
        },
        {
            country: 'SE',
            name: 'Stockholm',
            id: "3"
        },
        {
            country: 'SE',
            name: 'Uppsala',
            id: "4"
        },
    ];

export const mockLocations: Location[] = [
    {
        name: 'Warsaw Sport Center',
        id: "1"
    },
    {
        name: 'Wroclaw Sport Center',
        id: "2"
    },
    {
        name: 'Stockholm Sport Center',
        id: "3"
    },
    {
        name: 'Uppsala Sport Center',
        id: "4"
    },
]

export interface City {
    country: string;
    name: string;
    id: string;
}


export interface Location {
    id: string;
    name: string;
}
