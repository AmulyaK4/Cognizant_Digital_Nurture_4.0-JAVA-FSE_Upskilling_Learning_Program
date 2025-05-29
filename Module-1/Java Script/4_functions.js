// Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, category) {
  return { name, category };
}

function registerUser(event) {
  console.log("User registered for", event.name);
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

// Closure to track category registrations
function categoryCounter() {
  let count = 0;
  return function () {
    count++;
    return count;
  };
}
