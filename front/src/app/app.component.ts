import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsuariosService } from './services/usuario/usuarios.service';
import { RolesService } from './services/rol/roles.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {


  usuarioForm: FormGroup;
  roles: any;
  activo: any;
  usuarios: any;
  title: "usuario front";

  constructor(
    public fb: FormBuilder,
    public rolesService: RolesService,
    public usuariosService: UsuariosService
  ) {

  }
  ngOnInit(): void {

    /*valido el formulario*/
    this.usuarioForm = this.fb.group({
      nombre: ['', Validators.required],
      rol: ['', Validators.required],
      activo: ['', Validators.required],
    });;

    /*** obtengo todos los roles del services */
    this.rolesService.getAllRoles().subscribe(resp => {
      this.roles = resp;
    },
      error => { console.error(error) }
    );
    /*** obtengo todas las personas del services */
    this.usuariosService.getAllUsuarios().subscribe(resp => {
      this.usuarios = resp;
    },
      error => { console.error(error) }
    );
  }
    /*Funcion para guardar los datos con el metodo del services usuarios*/
    guardar(): void {
      this.usuariosService.saveUsuario(this.usuarioForm.value).subscribe(resp => {
        alert("Registro Creado Correctamente");
        this.usuarioForm.reset();
        this.usuarios.push(resp);
    },
      error => { console.error(error) }
    )
    }
  /*funcion para eliminar los datos con el metodo del services usuarios*/
  eliminar(usuarios): void{
    this.usuariosService.deleteUsuario(usuarios.id_usuario).subscribe(resp => {
      if (resp === true) {
        alert("Usuario "+usuarios.nombre+" eliminado.");
        this.usuarios.pop(usuarios);
      }
    },
      error => { console.error(error) })
    }
}
