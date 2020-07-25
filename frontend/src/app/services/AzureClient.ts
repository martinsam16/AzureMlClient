import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
import DataDto from '../models/DataDto';

@Injectable({
    providedIn: 'root'
})
export class AzureClient {

    api = environment.apiconx;

    constructor(private http: HttpClient) { }


    public isRunning() {
        return this.http.get<string>(`${this.api}/`, { responseType: 'text' });
    }

    public predecir(dto: DataDto) {
        console.log("-->", dto);
        return this.http.post(`${this.api}/score`, [dto]);
    }

}