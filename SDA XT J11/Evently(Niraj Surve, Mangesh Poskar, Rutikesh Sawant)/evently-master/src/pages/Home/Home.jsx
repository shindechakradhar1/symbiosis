import React from "react";
import Hero from "./Hero";
import Features from "./Features";
import Signup from "./Signup";

const Home = () => {
  return (
    <div id="home" className="flex flex-col items-center w-full">
      <Hero />
      <section id="quote" className="flex items-center justify-center w-full h-20">
        <h3 className="lg:text-xl max-md:text-md  text-center font-black font-mulish text-white opacity-100">Evently: Where Every Moment Becomes a Memory and Every Memory Tells a Story</h3>
      </section>
      <Features />
      <Signup />
    </div>
  );
};

export default Home;
