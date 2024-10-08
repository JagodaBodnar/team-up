import {useQuery} from "@tanstack/react-query";
import {SportControllerApi} from "../api/generated";

export const useGetSports = () => {
    const sportApi = new SportControllerApi();

    return useQuery({
        queryKey: ['sportCategories'],
        queryFn: () => sportApi.allSports()
    });
};