
function App() {
  return (
    <div className="App" style={{ marginTop: '40px' }}>
      <h1 style={{ color: '#8B0000', textAlign: 'center', fontSize: '2.5rem', fontWeight: 'bold' }}>Student Details:</h1>
      <div style={{ textAlign: 'center', fontSize: '1.3rem', marginTop: '20px' }}>
        <span style={{ color: 'blue', fontWeight: 'bold' }}>Name: </span>
        <span style={{ color: '#6495ED' }}>Steeve</span>
        <br />
        <span style={{ color: 'red', fontWeight: 'bold' }}>School: </span>
        <span style={{ color: '#C71585' }}>DNV Public School</span>
        <br />
        <span style={{ color: '#B22222', fontWeight: 'bold' }}>Total: </span>
        <span style={{ color: '#B22222' }}>284Marks</span>
        <br />
        <span style={{ color: 'green', fontWeight: 'bold' }}>Score:</span>
        <span style={{ color: '#66CDAA' }}>94.67%</span>
      </div>
    </div>
  );
}

export default App;
