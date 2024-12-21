import axios from 'axios';

export const API_BASE_URL = 'http://localhost:8080';

interface LoginResponse {
    token: string;
    expirationTime: number;
}

export const login = async (email: string, password: string): Promise<LoginResponse> => {
    const response = await axios.post<LoginResponse>(`${API_BASE_URL}/auth/login`, {
        email,
        password,
    });
    return response.data;
};
