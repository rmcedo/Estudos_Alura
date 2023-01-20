import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  photos = [
    {
      url: 'https://m.extra.globo.com/incoming/18470804-54b-64a/w367h550-PROP/cachorro-ri.jpg',
      description: 'Cachorro Sorrindo'
    },
    {
      url: 'https://veja.abril.com.br/wp-content/uploads/2016/12/cc3a3o.png?w=1024&resize=1200,800',
      description: 'Cachorro Sorring'
    }
  ];
}
