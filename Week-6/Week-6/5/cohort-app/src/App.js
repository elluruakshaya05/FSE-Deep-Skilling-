import React from 'react';
import CohortDetails from './components/CohortDetails';
import './App.css';

function App() {
  const cohorts = [
    { name: 'FS-React-Jan24', status: 'ongoing', startDate: '2024-01-15', endDate: '2024-03-15' },
    { name: 'FS-Java-Dec23', status: 'completed', startDate: '2023-12-01', endDate: '2024-02-01' },
    { name: 'FS-Node-Feb24', status: 'ongoing', startDate: '2024-02-20', endDate: '2024-04-20' },
    { name: 'FS-Python-Nov23', status: 'completed', startDate: '2023-11-10', endDate: '2024-01-10' }
  ];

  return (
    <div className="App">
      <header className="App-header">
        <h1>My Academy Dashboard</h1>
      </header>
      <div>
        {cohorts.map((cohort, index) => (
          <CohortDetails
            key={index}
            name={cohort.name}
            status={cohort.status}
            startDate={cohort.startDate}
            endDate={cohort.endDate}
          />
        ))}
      </div>
    </div>
  );
}

export default App;
