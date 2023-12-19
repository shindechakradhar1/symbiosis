import React from "react";
import ContactImage from "../../assets/img/home/contact-image.svg";

const Contact = () => {
  return (
    <section
      id="contact"
      className="md:grid max-md:flex max-md:flex-col-reverse max-md:gap-7 md:grid-cols-contact place-items-center bg-white opacity-90 px-14 max-md:px-8 md:h-[calc(100vh-64px)]"
    >
      <div
        id="contact-header"
        className="flex flex-col max-md:items-center md:gap-8 max-md:gap-4 md:pl-14 max-md:mb-8 max-md:w-full"
      >
        <div className="max-lg:text-[2rem] lg:text-[3rem] max-md:text-[1.6rem] sm:text[1.2rem] max-md:text-center font-extrabold text-dark">
          <h1>Get in touch</h1>
        </div>
        <div className="flex max-md:flex-col md:flex-wrap gap-4 max-md:w-full">
          <div className="form-input">
            <input
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none"
              type="text"
              name="name"
              id="name"
              placeholder="Name"
            />
          </div>
          <div className="form-input">
            <input
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none"
              type="email"
              name="email"
              id="email"
              placeholder="Email"
            />
          </div>
          <div className="form-input">
            <textarea
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none resize-none"
              type="text"
              name="message"
              id="message"
              rows={4}
              cols={20}
              placeholder="Message"
            />
          </div>
        </div>
        <button
            type="submit"
            className="btn-transition w-fit font-bold font-opensans uppercase rounded-xl mb-4 px-4 py-3 border-2 text-yellow bg-pink border border-pink hover:border-2 hover:text-pink hover:border-pink hover:bg-yellow"
          >
            Submit
          </button>
      </div>
      <div className="">
        <img src={ContactImage} alt="" />
      </div>
    </section>
  );
};

export default Contact;
