package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Correlation (
  correlationCoefficient: Number,  // Pearson correlation coefficient between cause and effect measurements
cause: String,  // ORIGINAL variable name of the cause variable for which the user desires correlations.
originalCause: Option[String],  // original name of the cause.
effect: String,  // ORIGINAL variable name of the effect variable for which the user desires correlations.
originalEffect: Option[String],  // effect variable original name.
onsetDelay: Double,  // User estimated or default time after cause measurement before a perceivable effect is observed
durationOfAction: Number,  // Time over which the cause is expected to produce a perceivable effect following the onset delay
numberOfPairs: Number,  // Number of points that went into the correlation calculation
effectSize: Option[String],  // Magnitude of the effects of a cause indicating whether it&#39;s practically meaningful.
statisticalSignificance: Option[String],  // A function of the effect size and sample size
timestamp: Number,  // Time at which correlation was calculated
reverseCorrelation: Option[Number],  // Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation.
causalityFactor: Option[Number],  // 
causeCategory: Option[String],  // Variable category of the cause variable.
effectCategory: Option[String],  // Variable category of the effect variable.
valuePredictingHighOutcome: Option[Number],  // cause value that predicts an above average effect value (in default unit for cause variable)
valuePredictingLowOutcome: Option[Number],  // cause value that predicts a below average effect value (in default unit for cause variable)
optimalPearsonProduct: Option[Number],  // Optimal Pearson Product
averageVote: Option[Number],  // Average Vote
userVote: Option[Number],  // User Vote
causeUnit: Option[String],  // Unit of the predictor variable
causeUnitId: Option[Integer]  // Unit Id of the predictor variable
)
