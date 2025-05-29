// Modern JavaScript Features (ES6+)
const register = (name = "Guest") => console.log("Welcome,", name);

const event = { name: "Tech Meetup", location: "Hall 1" };
const { name, location } = event;

const originalList = ["A", "B"];
const clonedList = [...originalList, "C"];
console.log(clonedList);
