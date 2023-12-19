import React from "react";
import { MdInsights } from "react-icons/md";
import { FaSearch, FaCalendarAlt } from "react-icons/fa";
import { IoSettings, IoChatbubbleEllipses, IoTicket } from "react-icons/io5";

const Features = () => {
  return (
    <section id="features" className="md:p-14 max-md:p-10">
      <div className="container mx-auto text-center">
        <h2 className="text-4xl text-dark font-bold mb-4">Our Features</h2>
        <p className="text-gray-600 font-mulish mb-12">
          Explore the features that make Evently the perfect platform for your
          events.
        </p>

        <div className="flex flex-wrap justify-center ">
          <div className="w-full md:w-1/2 lg:w-1/3 px-5 mb-8">
            <div className="group bg-white text-dark hover:bg-pink hover:text-white transition-all duration-300 ease-in-out p-10 rounded-lg shadow-md flex flex-col gap-3 items-center justify-center">
              <div className="p-3 border border-pink rounded-[50%]">
                <FaSearch className="text-[1.7rem]" />
              </div>
              <h3 className="text-xl font-medium mb-4">Effortless Discovery</h3>
              <p className="font-mulish">
                Effortlessly explore events with a streamlined user interface,
                simplifying the search process.
              </p>
            </div>
          </div>

          <div className="w-full md:w-1/2 lg:w-1/3 px-4 mb-8">
            <div className="group bg-white text-dark hover:bg-pink hover:text-white transition-all duration-300 ease-in-out p-10 rounded-lg shadow-md flex flex-col gap-3 items-center justify-center">
              <div className="p-3 border border-pink rounded-[50%]">
                <MdInsights className="text-[1.7rem]" />
              </div>
              <h3 className="text-xl font-medium mb-4">User Insights</h3>
              <p className="font-mulish">
                Gain valuable insights through attendee reviews, fostering a
                community-driven event selection experience.
              </p>
            </div>
          </div>

          <div className="w-full md:w-1/2 lg:w-1/3 px-4 mb-8">
            <div className="group bg-white text-dark hover:bg-pink hover:text-white transition-all duration-300 ease-in-out p-10 rounded-lg shadow-md flex flex-col gap-3 items-center justify-center">
              <div className="p-3 border border-pink rounded-[50%]">
                <IoSettings className="text-[1.7rem]" />
              </div>
              <h3 className="text-xl font-medium mb-4">Swift Setup</h3>
              <p className="font-mulish">
                Create and manage events seamlessly with intuitive tools,
                ensuring a hassle-free setup for organizers.
              </p>
            </div>
          </div>

          <div className="w-full md:w-1/2 lg:w-1/3 px-4 mb-8">
            <div className="group bg-white text-dark hover:bg-pink hover:text-white transition-all duration-300 ease-in-out p-10 rounded-lg shadow-md flex flex-col gap-3 items-center justify-center">
              <div className="p-3 border border-pink rounded-[50%]">
                <IoChatbubbleEllipses className="text-[1.7rem]" />
              </div>
              <h3 className="text-xl font-medium mb-4">Event Chat</h3>
              <p className="font-mulish">
                Facilitate real-time communication between attendees and
                organizers, fostering community engagement.
              </p>
            </div>
          </div>

          <div className="w-full md:w-1/2 lg:w-1/3 px-4 mb-8">
            <div className="group bg-white text-dark hover:bg-pink hover:text-white transition-all duration-300 ease-in-out p-10 rounded-lg shadow-md flex flex-col gap-3 items-center justify-center">
              <div className="p-3 border border-pink rounded-[50%]">
                <IoTicket className="text-[1.7rem]" />
              </div>
              <h3 className="text-xl font-medium mb-4">Ticketing Confidence</h3>
              <p className="font-mulish">
                Offer a secure and user-friendly ticketing system, ensuring a
                seamless experience from purchase to entry.
              </p>
            </div>
          </div>

          <div className="w-full md:w-1/2 lg:w-1/3 px-4 mb-8">
            <div className="group bg-white text-dark hover:bg-pink hover:text-white transition-all duration-300 ease-in-out p-10 rounded-lg shadow-md flex flex-col gap-3 items-center justify-center">
              <div className="p-3 border border-pink rounded-[50%]">
                <FaCalendarAlt className="text-[1.7rem]" />
              </div>
              <h3 className="text-xl font-medium mb-4">Calendar Harmony</h3>
              <p className="font-mulish">
                Integrate events into personal calendars effortlessly,
                accompanied by automatic reminders for organized planning.
              </p>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default Features;
