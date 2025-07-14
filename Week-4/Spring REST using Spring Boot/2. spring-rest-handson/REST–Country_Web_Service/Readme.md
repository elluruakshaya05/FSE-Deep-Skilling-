# output

<br>GET http://localhost:8083/country
<br>{
<br>  "code": "IN",
<br>  "name": "India"
<br>}
<br>
<br>
<br>GET http://localhost:8083/countries
<br>[
<br>  { "code": "IN", "name": "India" },
<br>  { "code": "US", "name": "United States" },
<br>  { "code": "JP", "name": "Japan" },
<br>  { "code": "DE", "name": "Germany" }
<br>]
<br>
<br>
<br>GET http://localhost:8083/countries/az
<br>{
<br>  "timestamp": "2025-06-28T10:28:00.000+00:00",
<br>  "status": 404,
<br>  "error": "Not Found",
<br>  "message": "Country not found",
<br>  "path": "/countries/az"
<br>}