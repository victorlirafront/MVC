import { rest } from "msw";
import { readFakeData } from "../fakeData";
import { fakeUserReservations } from "../userReservation";

export const handlers = [
  //A url precisa ser igual a que esta sendo usada no componente
  //esse  :showId indica que é uma variavel na URL
  //rest é um objeto fornecido para biblioteca msw
  rest.get("http://localhost:3000/api/shows/:showId", async (req, res, ctx) => {
    const { fakeShows } = await readFakeData();

    return res(
      ctx.json({
        show: fakeShows[0],
      })
    );
  }),
  rest.get("http://localhost:3000/api/users/:userId/reservations", (req, res, ctx) =>
    res(ctx.json({ userReservations: fakeUserReservations }))
  ),
];
