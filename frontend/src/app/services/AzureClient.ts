import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import DataDto from '../models/DataDto';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AzureClient {

  api = environment.url;

  constructor(
    private http: HttpClient
  ) {
  }


  public isRunning(): Observable<string> {
    return this.http.get<string>(`${this.api}`, {
      responseType: 'text' as 'json'
    });
  }

  public predict(dto: DataDto): Observable<Array<boolean>> {
    return this.http.post<Array<boolean>>(`${this.api}/predecir`, [dto]);
  }

}
