When you download Bootstrap (via npm or manually), you usually get a folder like this:

arduino
Copy
Edit
bootstrap/
│
├── css/
│   ├── bootstrap.css
│   ├── bootstrap.min.css
│   └── bootstrap.rtl.min.css
│
├── js/
│   ├── bootstrap.bundle.js
│   ├── bootstrap.bundle.min.js
│   └── bootstrap.min.js
│
└── icons/  ← (optional, separate download)
    └── bootstrap-icons.css
    └── font/ (SVG, WOFF files)
📁 css/ – Styling Files
bootstrap.css: Full unminified version (easy to read and edit)

bootstrap.min.css: Minified version (smaller size, better performance)

bootstrap.rtl.min.css: For right-to-left languages (like Arabic, Hebrew)

📁 js/ – Bootstrap JavaScript Components
bootstrap.bundle.min.js: Includes all Bootstrap components + Popper.js (for tooltips, dropdowns)

bootstrap.min.js: Bootstrap JavaScript without Popper.js

Use .bundle.min.js to avoid importing multiple files

📁 icons/ – (Optional Bootstrap Icons)
Not part of core Bootstrap; install separately from https://icons.getbootstrap.com

Includes .css for icons and font files (.woff, .ttf) to display scalable vector icons
