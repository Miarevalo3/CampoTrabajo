import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Modelos/user';
import { UserServicesService } from 'src/app/Servicios/user-services.service';

@Component({
  selector: 'app-inicio-sesion',
  templateUrl: './inicio-sesion.component.html',
  styleUrls: ['./inicio-sesion.component.css']
})
export class InicioSesionComponent implements OnInit {
  user = new User;
  constructor(private userservice: UserServicesService) { }

  ngOnInit(): void {
  }

  userlogin(){
    console.log(this.user);
    this.userservice.loginuser(this.user).subscribe(data =>{
      alert("inicio de sesion exitoso")
    },error=>alert("Telefono o contraseña incorrecta"))
  }

}
