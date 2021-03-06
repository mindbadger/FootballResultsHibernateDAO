package uk.co.mindbadger.footballresultsanalyser.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class SeasonDivisionIdImpl implements SeasonDivisionId<Integer> {
    private static final long serialVersionUID = 2044020611013634053L;

    private Season<Integer> season;
    private Division<Integer> division;

    @Override
    @ManyToOne (targetEntity=SeasonImpl.class)
    public Season<Integer> getSeason() {
	return season;
    }

    @Override
    public void setSeason(Season<Integer> season) {
	this.season = season;
    }

    @Override
    @ManyToOne (targetEntity=DivisionImpl.class)
    public Division<Integer> getDivision() {
	return division;
    }

    @Override
    public void setDivision(Division<Integer> division) {
	this.division = division;
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (o == null || getClass() != o.getClass())
	    return false;

	SeasonDivisionId<Integer> that = (SeasonDivisionId<Integer>) o;

	if (season != null ? !season.equals(that.getSeason()) : that.getSeason() != null)
	    return false;
	if (division != null ? !division.equals(that.getDivision()) : that.getDivision() != null)
	    return false;

	return true;
    }

    @Override
    public int hashCode() {
	int result;
	result = (season != null ? season.hashCode() : 0);
	result = 31 * result + (division != null ? division.hashCode() : 0);
	return result;
    }
}
