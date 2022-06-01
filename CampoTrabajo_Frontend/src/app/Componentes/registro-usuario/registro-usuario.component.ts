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

  constructor(private userservicesService: UserServicesService) { }

  ngOnInit(): void {
  }

  existsPK (val:string): void {
    this.msgError  = '';
    this.isDisabled = true; 
    this.userservicesService.get(val)
      .subscribe(
        data => {
          if (data!=null){
            this.msgError  = 'PK exists';
            this.isDisabled = true; 
          } else {
            this.isDisabled = false; 
          }
        },
        error => {
          this.msgError  = '';
          console.log(error);
        });
  }

  saveUser(): void {
    const data = {
      Name: this.user.Name,
      Lastname1: this.user.Lastname1,
      Lastname2: this.user.Lastname2,
      Phone: this.user.Phone,
      Rol: this.user.Rol,
      Password: this.user.Password
    };


    this.userservicesService.create(data)
      .subscribe(
        data => {
          this.submitted=true;
          console.log(data);
        },
        err => {
          this.msgError  = err.error.message;
          console.log(err);
        });
  }

  newuser() {
    this.submitted = false;
    this.user.Name = null;
    this.user.Lastname1 = null;
    this.user.Lastname2 = null;
    this.user.Phone = null;
    this.user.Rol = null;
    this.user.Password = null;
    this.isDisabled = true;
  }

}
