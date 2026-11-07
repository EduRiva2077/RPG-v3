import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {
  backendStatus: 'checking' | 'online' | 'offline' = 'checking';

  async ngOnInit(): Promise<void> {
    try {
      const response = await fetch('/api/health');

      if (!response.ok) {
        throw new Error('Backend unavailable');
      }

      const data = await response.json();

      this.backendStatus =
        data.status === 'UP' ? 'online' : 'offline';
    } catch {
      this.backendStatus = 'offline';
    }
  }
}