import React from "react";
import { FaPhoneAlt, FaFacebook } from "react-icons/fa";
import { TbWorldWww } from "react-icons/tb";
import { IoLocationSharp } from "react-icons/io5";
import { FaXTwitter } from "react-icons/fa6";
import { RiInstagramFill } from "react-icons/ri";
import { Link } from "react-router-dom";

const Footer = () => {
  return (
    <footer className="flex flex-col items-center bg-pink py-8 ">
      <div className="flex flex-wrap max-md:flex-col items-center w-full font-mulish">
        <div className="flex md:px-16 md:py-8 max-md:p-6 items-center justify-center gap-4 flex-grow">
          <div className="text-white text-2xl">
            <FaPhoneAlt />
          </div>
          <div className="text-white max-md:items-center text-sm flex flex-col md:items-start">
            <span>+91 1234567890</span>
            <span>+91 9876543210</span>
          </div>
        </div>
        <div className="flex md:px-16 md:py-8 max-md:p-6 items-center justify-center gap-4 flex-grow">
          <div className="text-white text-3xl">
            <TbWorldWww />
          </div>
          <div className="text-white max-md:items-center text-sm flex flex-col md:items-start">
            <span>support@evently.com</span>
            <span>evently-web.netlify.app</span>
          </div>
        </div>
        <div className="flex md:px-16 md:py-8 max-md:p-6 items-center justify-center gap-4 flex-grow">
          <div className="text-white text-2xl">
            <IoLocationSharp />
          </div>
          <div className="text-white max-md:items-center text-sm flex flex-col md:items-start">
            <span>Lavel, Khed</span>
            <span>Maharashtra, 415703</span>
          </div>
        </div>
      </div>
      <div className="flex flex-col items-center gap-4 max-md:mt-4">
        <div className="flex text-xl gap-4">
          <div className="btn-transition bg-white text-dark p-4 rounded-[50%] hover:bg-yellow hover:shadow-2xl cursor-pointer">
            <FaFacebook />
          </div>
          <div className="btn-transition bg-white text-dark p-4 rounded-[50%] hover:bg-yellow hover:shadow-2xl cursor-pointer">
            <FaXTwitter />
          </div>
          <div className="btn-transition bg-white text-dark p-4 rounded-[50%] hover:bg-yellow hover:shadow-2xl cursor-pointer">
            <RiInstagramFill />
          </div>
        </div>
        <div className="text-sm text-center text-white font-mulish">
          Copyright © <Link className="btn-transition hover:text-yellow" to='/'>Evently</Link>. All Rights Reserved.
        </div>
      </div>
    </footer>
  );
};

export default Footer;
