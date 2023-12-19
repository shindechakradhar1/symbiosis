import React from "react";
import HeroImage from "../../assets/img/home/hero-image.svg";
import { Link } from "react-router-dom";

const Hero = () => {
  const scrollToSignup = () => {
    const signup = document.getElementById("signup");

    signup.scrollIntoView({ behavior: "smooth" });
  };

  return (
    <section
      id="hero"
      className="md:grid max-md:flex max-md:flex-col max-md:gap-7 md:grid-cols-hero place-items-center bg-white opacity-90 px-14 md:px-8 h-[calc(100vh-64px)]"
    >
      <div className="max-md:mt-14">
        <img src={HeroImage} alt="" />
      </div>
      <div
        id="hero-header"
        className="flex flex-col max-md:items-center gap-8 md:pl-14"
      >
        <div className="max-lg:text-[2rem] lg:text-[3rem] max-md:text-[1.6rem] sm:text[1.2rem] max-md:text-center font-extrabold text-dark">
          <h1>
            Where Every Moment Finds Its Event - Event
            <span className="text-pink">ly</span>
          </h1>
        </div>
        <p className="leading-6 max-md:text-center">
          Immerse yourself in events that leave a lasting impression. Attend
          with friends, meet new people, and make memories that will be
          cherished forever.
        </p>
        <Link>
          <button
            className="btn-transition font-bold px-8 py-3 bg-pink text-white rounded-lg border border-pink hover:bg-white hover:text-pink hover:border-pink shadow-xl"
            onClick={scrollToSignup}
          >
            Signup
          </button>
        </Link>
      </div>
    </section>
  );
};

export default Hero;
