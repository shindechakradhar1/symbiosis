import React, { useState } from "react";
import SignupImage from "../../assets/img/home/signup-image.svg";
import { FaEye, FaEyeSlash } from "react-icons/fa";

const Signup = () => {
  const [showPassword, setShowPassword] = useState(false);

  const togglePasswordVisibility = () => {
    setShowPassword(!showPassword);
  };

  return (
    <section
      id="signup"
      className="grid md:grid-cols-hero md:items-center gap-14 w-full md:h-screen max-md:px-10 md:px-14 py-20 bg-white"
    >
      <div>
        <img className="w-full" src={SignupImage} alt="" />
      </div>
      <div className="px-6">
        <h2 className="text-4xl max-md:text-center font-black text-dark">
          Unlock Your World
        </h2>
        <p className="mb-8 mt-2 max-md:text-center font-mulish font-semibold">
          Sign up now!
        </p>
        <form className="flex max-md:flex-col md:flex-wrap gap-4">
          <div className="form-input">
            <input
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none"
              type="text"
              name="fname"
              id="fname"
              placeholder="First Name"
            />
          </div>
          <div className="form-input">
            <input
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none"
              type="text"
              name="lname"
              id="fname"
              placeholder="Last Name"
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
            <input
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none"
              type="number"
              name="mobile"
              id="mobile"
              placeholder="Mobile"
            />
          </div>
          <div className="form-input flex items-center">
            <input
              className="text-white bg-transparent px-4 py-3 rounded-xl w-full focus:outline-none"
              type={showPassword ? "text" : "password"}
              name="password"
              id="password"
              placeholder="Password"
            />
            {showPassword ? (
              <FaEyeSlash
                className="text-2xl text-white cursor-pointer mr-3"
                onClick={togglePasswordVisibility}
              />
            ) : (
              <FaEye
                className="text-2xl text-white cursor-pointer mr-3"
                onClick={togglePasswordVisibility}
              />
            )}
          </div>
          <button
            type="submit"
            className="btn-transition font-bold font-opensans uppercase rounded-xl mb-4 px-4 py-3 border-2 text-yellow bg-pink border border-pink hover:border-2 hover:text-pink hover:border-pink hover:bg-yellow"
          >
            Submit
          </button>
        </form>
      </div>
    </section>
  );
};

export default Signup;
