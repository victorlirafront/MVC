import { rest } from "msw";
import { readFakeData } from "../fakeData";
import { fakeUserReservations } from "../userReservation";

export const handlers = [
  //A url precisa ser igual a que esta sendo usada no componente
  //esse  :showId indica que é uma variavel na URL
  //rest é um objeto fornecido para biblioteca msw
  rest.get("http://localhost:3000/api/shows/:showId", async (req, res, ctx) => {
    const { fakeShows } = await readFakeData();
    const { showId } = req.params;

    //index / showId = 0 has seats available in fake data
    //index / showId = 1 has No seats available
    return res(
      ctx.json({
        show: fakeShows[Number(showId)],
      })
    );
  }),
  rest.get("http://localhost:3000/api/users/:userId/reservations", (req, res, ctx) =>
    res(ctx.json({ userReservations: fakeUserReservations }))
  ),
];
