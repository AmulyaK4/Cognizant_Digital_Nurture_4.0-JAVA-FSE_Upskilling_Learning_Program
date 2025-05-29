// Async JS, Promises, Async/Await
function fetchEvents() {
  console.log("Loading...");
  fetch("https://api.example.com/events")
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.error("Error:", err));
}

async function fetchWithSpinner() {
  console.log("Fetching...");
  try {
    const res = await fetch("https://api.example.com/events");
    const data = await res.json();
    console.log(data);
  } catch (e) {
    console.error("Async error:", e);
  }
}
