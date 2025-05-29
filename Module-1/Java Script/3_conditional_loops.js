// Conditionals, Loops, Error Handling
const events = [
  { name: "Tech Talk", date: "2025-08-01", seats: 20 },
  { name: "Old Expo", date: "2022-05-01", seats: 0 }
];

events.forEach(event => {
  if (new Date(event.date) > new Date() && event.seats > 0) {
    console.log(`Available: ${event.name}`);
  }
});

function register(seats) {
  try {
    if (seats <= 0) throw "No seats available!";
    console.log("Successfully registered.");
  } catch (err) {
    console.error("Error:", err);
  }
}
