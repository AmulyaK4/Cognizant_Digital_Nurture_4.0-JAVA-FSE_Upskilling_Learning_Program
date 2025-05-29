// Debugging and Testing
console.log("Form submitted");

function debugFetch() {
  fetch("https://api.example.com/data")
    .then(res => {
      console.log("Status:", res.status);
      return res.json();
    })
    .then(data => {
      console.log("Response:", data);
    });
}
