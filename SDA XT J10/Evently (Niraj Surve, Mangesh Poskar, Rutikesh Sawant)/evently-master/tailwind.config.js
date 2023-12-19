/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],
  theme: {
    extend: {
      fontFamily: {
        'mulish': 'Mulish, sans-serif',
        'opensans': 'Open Sans, sans-serif'
      },
      colors: {
        'pink': '#ed254e',
        'yellow': '#f9dc5c',
        'dark': '#011936'
      },
      gridTemplateColumns: {
        'hero': '5fr 7fr',
        'about': '7fr 5fr',
        'contact': '6fr 6fr',
      }
    },
  },
  plugins: [],
}