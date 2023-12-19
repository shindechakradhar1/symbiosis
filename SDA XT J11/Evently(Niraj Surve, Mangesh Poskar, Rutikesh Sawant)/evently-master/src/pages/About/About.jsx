import React from "react";
import AboutImage from "../../assets/img/home/about-image.svg";

const About = () => {
  return (
    <section
      id="about"
      className="md:grid max-md:flex max-md:flex-col-reverse max-md:gap-7 md:grid-cols-about place-items-center bg-white opacity-90 px-14 md:px-8 md:h-[calc(100vh-64px)]"
    >
      <div
        id="about-header"
        className="flex flex-col max-md:items-center md:gap-8 max-md:gap-4 md:pl-14 max-md:mb-8"
      >
        <div className="max-lg:text-[2rem] lg:text-[3rem] max-md:text-[1.6rem] sm:text[1.2rem] max-md:text-center font-extrabold text-dark">
          <h1>
            About Event
            <span className="text-pink">ly</span>
          </h1>
        </div>
        <p className="leading-6 max-md:text-center md:text-justify font-mulish">
          At Evently, we are passionate about bringing people together through unforgettable experiences. Our mission is to create a platform where event organizers and attendees can seamlessly connect, explore, and celebrate.
        </p>
        <p className="leading-6 max-md:text-center md:text-justify font-mulish">Join us on this exciting journey, and let's create, share, and celebrate together. Evently: Where Every Moment Matters, and Every Memory Tells a Story.</p>
      </div>
      <div className="">
        <img src={AboutImage} alt="" />
      </div>
    </section>
  );
};

export default About;
