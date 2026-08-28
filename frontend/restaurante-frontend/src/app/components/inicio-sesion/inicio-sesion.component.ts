import { Component, inject } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-inicio-sesion',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './inicio-sesion.component.html',
  styleUrl: './inicio-sesion.component.css'
})
export class InicioSesionComponent {

  //utilizas INJECT para los formularios
  private fb = inject(FormBuilder); //te facilita la vida a la hora de hacer formularios
  private router = inject(Router); //en caso de que las credenciales sean correctas, para navegar a otro componente


  //defines las reglas del formulario (validaciones)
  loginForm: FormGroup = this.fb.group({ //metes lo que quieras validar
    email: ['', [Validators.required, Validators.email]], //que tenga formato email
    password: ['', [Validators.required, Validators.minLength(6)]] //longitud de la cadena
  });


  //metodo que se utiliza para la validacion de usuarios y envios de respuesta
  onSubmit(): void {
    if(this.loginForm.valid){

    }
    else{ //si los datos son incorrectos
      this.loginForm.markAllAsTouched();
    }
  }

}
