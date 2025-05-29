// Event Handling
document.querySelector("#registerBtn").onclick = () => {
  alert("You clicked register!");
};

document.querySelector("#eventFilter").onchange = function () {
  console.log("Filter selected:", this.value);
};

document.querySelector("#searchBox").onkeydown = function (e) {
  console.log("Typing:", e.key);
};
