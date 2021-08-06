import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  private API_SERVER = "http://localhost:8080/usuario/";

  constructor(private httpClient: HttpClient) { }

  public getAllUsuarios(): Observable<any> {
    return this.httpClient.get(this.API_SERVER + "consultar");
  }

  public saveUsuario(usuario: any): Observable<any>{
    return this.httpClient.post(this.API_SERVER + "guardar",usuario);
  }

  public deleteUsuario(id): Observable<any>{
    //console.log(id);
    return this.httpClient.delete(this.API_SERVER + "delete/"+id);
  }

}
