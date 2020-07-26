import {Component, OnInit} from '@angular/core';
import {MatSnackBar} from '@angular/material/snack-bar';

import DataDto from '../models/DataDto';
import {AzureClient} from '../services/AzureClient';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  public dto: DataDto = new DataDto();

  constructor(
    private cliente: AzureClient,
    private snackBar: MatSnackBar
  ) {
  }

  ngOnInit(): void {
  }

  run(): void {
    this.cliente.predict(this.dto)
      .subscribe(data => {
        const diabetes = data[0];
        this.mostrarSnackbar(diabetes ? 'Tendrá diabetes' : 'No tendrá diabetes');
      });
  }

  getStatus(): void {
    this.cliente.isRunning()
      .subscribe(data => {
        this.mostrarSnackbar(data);
      });

  }

  mostrarSnackbar(data): void {
    this.snackBar.open(data, 'x');
  }

  clear(): void {
    this.dto = new DataDto();
    this.snackBar.dismiss();
  }

  demo(): void {
    this.dto.Embarazos = 2;
    this.dto.Glucosa = 130;
    this.dto.PreTrueonSanguinea = 64;
    this.dto.PliegueCutaneo = 35;
    this.dto.Insulina = 119;
    this.dto.IndiceMasaCorporal = 30.5;
    this.dto.PedigriDiabetes = 1.4;
    this.dto.Edad = 19;
  }


}

