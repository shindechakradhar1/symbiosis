import React, { useState } from "react";
import logo from "../../assets/img/logo/logo.svg";
import { Link, NavLink } from "react-router-dom";
import { FaBars, FaXmark } from "react-icons/fa6";

const Navbar = () => {
  const [isNavOpen, setIsNavOpen] = useState(false);

  const toggleNavbar = () => {
    setIsNavOpen(!isNavOpen);
  };

  return (
    <nav className="flex flex-row items-center sticky top-0 justify-between bg-white h-[64px] max-sm:px-4 w-full z-50 px-14">
      <Link to='/' className="flex flex-row items-center">
        <img className="h-[41.2px] pr-2" src={logo} alt="logo" />
        <h2 className="font-bold text-xl capitalize">
          Event<span className="text-pink lowercase">ly</span>
        </h2>
      </Link>
      <div
        id="nav-list"
        className={`max-md:fixed max-md:top-0 max-md:-right-[250px] max-md:h-screen flex max-md:flex-col md:items-center max-md:w-[250px] pl-6 pt-1 gap-8 max-md:bg-slate-400 max-md:transition-[right] text-dark font-mulish z-[52] ${
          isNavOpen ? "max-md:right-0" : "max-md:-right-[250px]"
        }`}
      >
        <div className="md:hidden relative flex flex-row items-center">
          <img className="h-[41.2px] pr-2" src={logo} alt="logo" />
          <h2 className="font-bold text-xl capitalize">
            Event<span className="text-pink lowercase">ly</span>
          </h2>
          <FaXmark
            className="absolute right-5 cursor-pointer"
            onClick={toggleNavbar}
          />
        </div>
        <NavLink to="/" className="nav-link relative">
          Home
        </NavLink>
        <NavLink to="/about" className="nav-link relative">
          About
        </NavLink>
        <NavLink
          to="/contact"
          className={({ isActive }) =>
            isActive ? "nav-link active" : "nav-link"
          }
        >
          Contact
        </NavLink>
        <Link to="/contact">
          <button className="btn-transition bg-yellow px-4 py-2 rounded-lg font-bold border border-yellow hover:border-yellow hover:bg-white shadow-lg hover:text-yellow">
            Sign In
          </button>
        </Link>
      </div>
      <div
        id="nav-toggle"
        className="md:hidden flex flex-col items-center text-lg w-[35px] h-[35px] p-2 bg-pink rounded-lg cursor-pointer"
        onClick={toggleNavbar}
      >
        <FaBars className="text-yellow text-lg" />
      </div>
    </nav>
  );
};

export default Navbar;
