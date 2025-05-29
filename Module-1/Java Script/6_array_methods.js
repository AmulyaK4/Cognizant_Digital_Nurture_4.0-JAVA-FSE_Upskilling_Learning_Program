// Arrays and Methods
let events = [
  { name: "Music Night", category: "music" },
  { name: "Baking Workshop", category: "cooking" }
];

events.push({ name: "Jazz Show", category: "music" });

const musicEvents = events.filter(e => e.category === "music");

const displayCards = events.map(e => `Event: ${e.name}`);
console.log(displayCards);
