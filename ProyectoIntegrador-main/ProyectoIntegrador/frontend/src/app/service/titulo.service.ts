import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Titulo } from '../model/titulo';

@Injectable({
  providedIn: 'root'
})

export class TituloService {
  URL = 'https://proyectointegradorap.herokuapp.com/titulo/';

  constructor(private httpClient: HttpClient) {}
   
  public lista(): Observable<Titulo[]>{
      return this.httpClient.get<Titulo[]>(this.URL + 'lista');
    }

    public detail(id: number): Observable<Titulo>{
      return this.httpClient.get<Titulo>(this.URL + `detail/${id}`);
    }

    public save(titulo: Titulo): Observable<any>{
      return this.httpClient.post<any>(this.URL + 'create', titulo);
    }

    public update(id: number, titulo:Titulo):Observable<any>{
      return this.httpClient.put<any>(this.URL + `update/${id}`, titulo);
    }

    public delete(id: number): Observable<any>{
      return this.httpClient.delete<any>(this.URL + `delete/${id}`);
    }
}
