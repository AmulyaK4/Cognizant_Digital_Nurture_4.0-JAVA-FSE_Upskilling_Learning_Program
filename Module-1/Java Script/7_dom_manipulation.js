// DOM Manipulation
const container = document.querySelector("#eventContainer");

function renderEvent(name) {
  const card = document.createElement("div");
  card.className = "eventCard";
  card.textContent = name;
  container.appendChild(card);
}
