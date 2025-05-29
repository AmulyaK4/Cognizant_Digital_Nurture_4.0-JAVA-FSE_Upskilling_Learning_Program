// Objects and Prototypes
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};

const musicFest = new Event("Music Fest", "2025-09-10", 50);
console.log(Object.entries(musicFest));
console.log("Available?", musicFest.checkAvailability());
