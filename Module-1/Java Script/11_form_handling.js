// Form Handling
document.querySelector("form").addEventListener("submit", function(e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  const event = this.elements["event"].value;

  if (!name || !email || !event) {
    alert("All fields are required!");
    return;
  }

  console.log("Registered:", name, email, event);
});
