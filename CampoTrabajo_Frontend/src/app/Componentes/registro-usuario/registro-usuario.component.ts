import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Modelos/user';
import { UserServicesService } from 'src/app/Servicios/user-services.service';
@Component({
  selector: 'app-registro-usuario',
  templateUrl: './registro-usuario.component.html',
  styleUrls: ['./registro-usuario.component.css']
})
export class RegistroUsuarioComponent implements OnInit {
  user = new User();
  submitted = false;
  msgError = '';
  isDisabled = true; 

  constructor(private userservice: UserServicesService) { }

  ngOnInit(): void {
  }

  userRegister():void{
    console.log(this.user);
    const data ={
      Name: this.user.Name ,
	    Lastname1: this.user.Lastname1,
	    Lastname2: this.user.Lastname2,
	    Phone: this.user.Phone,
	    Password: this.user.Password
    };
    this.userservice.registerUser(data).subscribe(data =>{
      alert("Usuario registrado")
    },error=>alert("Error al registrar el usuario"));

  }

}
 