import { render, screen } from "@testing-library/react";

import Home from "@/pages/index";

test("page has correct heading and image", () => {
  render(<Home />);

  const heading = screen.getByRole("heading", {
    name: "Welcome to Popular Concert Venue",
  });

  expect(heading).toBeInTheDocument();
});
